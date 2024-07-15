package Builder;
public class Computer {
    // Required parameters
    private final String CPU;
    private final int RAM;

    // Optional parameters
    private final String GPU;
    private final int storage;
    private final String display;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.GPU = builder.GPU;
        this.storage = builder.storage;
        this.display = builder.display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", GPU='" + GPU + '\'' +
                ", storage=" + storage +
                ", display='" + display + '\'' +
                '}';
    }

    public static class Builder {
        // Required parameters
        private final String CPU;
        private final int RAM;

        // Optional parameters
        private String GPU;
        private int storage;
        private String display;

        public Builder(String CPU, int RAM) {
            if (CPU == null || RAM <= 0) {
                throw new IllegalArgumentException("CPU and RAM must be specified");
            }
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder withGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder withStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder withDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
