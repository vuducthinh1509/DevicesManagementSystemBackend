package com.javaspringboot.DevicesManagementSystemBackend.service;

import com.javaspringboot.DevicesManagementSystemBackend.model.Device;
import com.javaspringboot.DevicesManagementSystemBackend.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;


    public Set<Device> findDeviceByStatus(String status) {
        return deviceRepository.findDeviceWithStatus(status);
    }
}
