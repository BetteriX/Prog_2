public class Processor {
    private double freq;
    private int cpu_cores;

    public Processor(String adatok) {
        String[] spec = adatok.split(" ");
        this.freq = Double.parseDouble(spec[0]);
        this.cpu_cores = Integer.parseInt(spec[1]);
    }

    public double Get_Performance_Score() {
        return this.freq * this.cpu_cores;
    }

    // Ha cores >= 6 és freq >= 3.5 akkor high performance igaz ha nem hamis
    public boolean High_Performance() {
        if (this.cpu_cores >= 6) {
            if (this.freq >= 3.5) {
                return true;
            }
        }
        return false;
    }

    public int Compare(Processor cpu) {
        if (this.Get_Performance_Score() > cpu.Get_Performance_Score()) {
            return 1;
        } else if (this.Get_Performance_Score() < cpu.Get_Performance_Score()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Processor(%.1f, %d cores)", this.freq, this.cpu_cores);
    }
}
