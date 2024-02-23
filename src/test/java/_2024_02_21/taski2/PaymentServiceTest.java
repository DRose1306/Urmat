package _2024_02_21.taski2;

import _2024_02_21.mock.SimpleTradingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PaymentServiceTest {

    SimpleNotificationService notificationService = mock(SimpleNotificationService.class);

    SimpleTransactionRepository transactionRepository = mock(SimpleTransactionRepository.class);

    PaymentService paymentService = new PaymentService(notificationService, transactionRepository);

    /**********************/
    @Test
    void makePaymentTrueTest() {
        when(transactionRepository.processTransaction(Mockito.anyDouble())).thenReturn(true);
        Assertions.assertTrue(paymentService.makePayment(Mockito.anyDouble()));
        verify(notificationService).sendPaymentNotification("Payment successful for amount: " + Mockito.anyString());
    }

    @Test
    void makePaymentFalseTest() {
        when(transactionRepository.processTransaction(Mockito.anyDouble())).thenReturn(false);
        Assertions.assertFalse(paymentService.makePayment(Mockito.anyDouble()));
        verify(notificationService).sendPaymentNotification("Payment failed for amount: " + Mockito.anyString());
    }

    /**********************/
    @Test
    void refundPaymentTrueTest() {
        Mockito.when(transactionRepository.processTransaction(-Mockito.anyDouble())).thenReturn(true);
        Assertions.assertTrue(paymentService.refundPayment(Mockito.anyDouble()));
        Mockito.verify(notificationService).sendPaymentNotification(Mockito.anyString());
    }

    @Test
    void refundPaymentFalseTest() {
        Mockito.when(transactionRepository.processTransaction(-Mockito.anyDouble())).thenReturn(false);
        Assertions.assertFalse(paymentService.refundPayment(Mockito.anyDouble()));
        Mockito.verify(notificationService).sendPaymentNotification(Mockito.anyString());
    }

    /**************************/

    @Test
    public void adjustPaymentTest() {
        double originalAmount = 100.0;
        double newAmount = 150.0;

        Mockito.when(transactionRepository.processTransaction(-originalAmount)).thenReturn(true);
        Mockito.when(transactionRepository.processTransaction(newAmount)).thenReturn(true);
        Assertions.assertTrue(paymentService.adjustPayment(originalAmount, newAmount));

        Mockito.verify(transactionRepository).processTransaction(-originalAmount);
        Mockito.verify(transactionRepository).processTransaction(newAmount);

        Mockito.verify(notificationService).sendPaymentNotification("Adjustment refund successful for amount: " + originalAmount);
        Mockito.verify(notificationService).sendPaymentNotification("Adjustment payment successful for amount: " + newAmount);
    }

    @Test
    public void adjustPayment_PaymentFailureTest() {
        double originalAmount = 100.0;
        double newAmount = 150.0;

        Mockito.when(transactionRepository.processTransaction(-originalAmount)).thenReturn(true);
        Mockito.when(transactionRepository.processTransaction(newAmount)).thenReturn(false);
        Assertions.assertTrue(paymentService.adjustPayment(originalAmount, newAmount));

        Mockito.verify(transactionRepository).processTransaction(-originalAmount);
        Mockito.verify(transactionRepository).processTransaction(newAmount);

        Mockito.verify(notificationService).sendPaymentNotification("Adjustment refund successful for amount: " + originalAmount);
        Mockito.verify(notificationService).sendPaymentNotification("Adjustment payment failed for amount: " + newAmount);
    }

    @Test
    public void adjustPaymentTest_RefundFailureTest() {
        double originalAmount = 100.0;
        double newAmount = 150.0;

        Mockito.when(transactionRepository.processTransaction(-originalAmount)).thenReturn(false);
        Assertions.assertFalse(paymentService.adjustPayment(originalAmount, newAmount));

        Mockito.verify(transactionRepository).processTransaction(-originalAmount);
        Mockito.verify(notificationService).sendPaymentNotification("Adjustment refund failed for amount: " + originalAmount);
    }

    /*******************/

    @Test
    void verifyPayment() {
        double amount = 100.0;

        Mockito.when(transactionRepository.processTransaction(amount)).thenReturn(true);
        Assertions.assertTrue(paymentService.verifyPayment(amount));
        Mockito.verify(notificationService).sendPaymentNotification("Payment verified for amount: " + amount);
    }

    /**************/

    @Test
    void cancelPaymentSuccessfulTest() {
        double amount = 100.0;

        Mockito.when(transactionRepository.processTransaction(-amount)).thenReturn(true);
        Assertions.assertTrue(paymentService.cancelPayment(amount));
        Mockito.verify(notificationService).sendPaymentNotification("Payment cancellation successful for amount: " + amount);
    }

    @Test
    void cancelPaymentFailedTest() {
        double amount = 100.0;

        Mockito.when(transactionRepository.processTransaction(-amount)).thenReturn(false);
        Assertions.assertFalse(paymentService.cancelPayment(amount));
        Mockito.verify(notificationService).sendPaymentNotification("Payment cancellation failed for amount: " + amount);
    }




}
