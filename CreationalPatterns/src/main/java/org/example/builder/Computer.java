package org.example.builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    @Override
    public String toString() {
        return
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'';
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;

        public ComputerBuilder withCPU(String cpu) {
            this.CPU = cpu;
            return this;
        }

        public ComputerBuilder withRAM(String ram) {
            this.RAM = ram;
            return this;
        }
        public ComputerBuilder withStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public ComputerBuilder withGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
