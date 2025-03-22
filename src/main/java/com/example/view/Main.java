package com.example.view;

import com.example.Controller.BillboardController;

public class Main {
    public Main() {
        BillboardController billboardController = new BillboardController();
        BillboardPanel.setBillboardData(billboardController.getBillboard());

        BillboardPanel.launch();
    }
}