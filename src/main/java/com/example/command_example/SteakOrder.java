package com.example.command_example;

class SteakOrder implements OrderCommand {
    private Chef chef;

    public SteakOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.grillSteak();
    }
}