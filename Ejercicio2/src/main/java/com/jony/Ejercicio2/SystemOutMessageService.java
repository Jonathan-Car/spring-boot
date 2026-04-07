package com.jony.Ejercicio2;
import org.springframework.stereotype.Service;
@Service
public class SystemOutMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}