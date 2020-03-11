import java.util.Arrays;

public class SortingAlgorithmResult {

    private AlgorithmType algorithmType;
    private long duration;
    private int[] input;
    private int[] output;

    public SortingAlgorithmResult(AlgorithmType algorithmType, long duration, int[] input, int[] output) {
        this.algorithmType = algorithmType;
        this.duration = duration;
        this.input = input;
        this.output = output;
    }

    public AlgorithmType getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(AlgorithmType algorithmType) {
        this.algorithmType = algorithmType;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int[] getInput() {
        return input;
    }

    public void setInput(int[] input) {
        this.input = input;
    }

    public int[] getOutput() {
        return output;
    }

    public void setOutput(int[] output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "=======================\n"
                + getAlgorithmType() + "\n"
                + "Duration: " + getDuration() + " nanoseconds\n"
                + "Input: " + Arrays.toString(getInput()) + "\n"
                + "Output: " + Arrays.toString(getOutput()) + "\n"
                + "=======================\n";
    }

}