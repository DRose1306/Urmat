package _2023_11_29;

public interface Maintainable {
    //_2023_11_29.Maintainable (Обслуживаемый)
    //        //        Методы:
    //        //            void repairItem()
    //        //            void updateItemCondition(_2023_11_29.ItemCondition condition)
    //        //            _2023_11_29.ItemCondition checkCondition()
    void repairItem();
    void updateItemCondition(ItemCondition condition);
    ItemCondition checkCondition();
}
