package _2023_11_22.three;

import java.time.LocalDateTime;

abstract class Device {
    //3.5. Абстрактный класс Device:
    //Поля: String deviceId, String location, boolean isOn, LocalDateTime lastChecked.
    //Абстрактные методы для базовых операций устройства.
    protected String deviceID;
    protected String location;
    protected boolean isOn;
    LocalDateTime lastChecked;

    abstract void lastCheckTime();
    abstract void isOn();
}
