package com.example;

import com.example.Controller.BillboardController;
import com.example.view.BillboardPanel;

public class App {
    public static void main(String[] args) {

        BillboardController billboardController = new BillboardController();
        BillboardPanel.setBillboardData(billboardController.getBillboard());

        BillboardPanel.launch(BillboardPanel.class, args);

    }
}
