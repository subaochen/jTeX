package cn.edu.sdut.softlab.jtex;

/**
 * Created by subaochen on 17-9-17.
 * @see <<The TeXbook>> page 272
 */
public class Penalty {
    private int linePenalty;
    private int hyphenPenalty;

    public int getLinePenalty() {
        return linePenalty;
    }

    public void setLinePenalty(int linePenalty) {
        this.linePenalty = linePenalty;
    }

    public int getHyphenPenalty() {
        return hyphenPenalty;
    }

    public void setHyphenPenalty(int hyphenPenalty) {
        this.hyphenPenalty = hyphenPenalty;
    }
}
