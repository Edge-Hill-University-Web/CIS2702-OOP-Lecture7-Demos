package com.example.command_example;

class DessertOrder implements OrderCommand {
    private Chef chef;

    public DessertOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.bakeDessert();
    }
}