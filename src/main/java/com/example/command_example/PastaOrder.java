package com.example.command_example;

// Concrete Commands
class PastaOrder implements OrderCommand {
    private Chef chef;

    public PastaOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookPasta();
    }
}