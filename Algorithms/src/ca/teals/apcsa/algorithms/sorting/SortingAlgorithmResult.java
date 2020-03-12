package ca.teals.apcsa.algorithms.sorting;

import ca.teals.apcsa.algorithms.AlgorithmType;

public class SortingAlgorithmResult {

    private AlgorithmType algorithmType;
    private long duration;
    private int size;

    public SortingAlgorithmResult(AlgorithmType algorithmType, long duration, int size) {
        this.algorithmType = algorithmType;
        this.duration = duration;
        this.size = size;
    }

    public AlgorithmType getAlgorithmType() {
        return algorithmType;
    }

    public long getDuration() {
        return duration;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "=======================\n"
                + getAlgorithmType() + "\n"
                + "Duration: " + getDuration() + " nanoseconds\n"
                + "Size: " + getSize() + "\n"
                + "=======================\n";
    }

}