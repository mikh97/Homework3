public class Numbers {
    int redNumber;
    int cyanNumber;
    int orangeNumber;

    GraphView gView;

    public Numbers(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.cyanNumber = n2;
        this.orangeNumber = n3;
    }

    public void attach(GraphView gView) {
        this.gView = gView;
    }

    public void updateValues(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.cyanNumber = n2;
        this.orangeNumber = n3;

        gView.updateGraph(n1, n2, n3);
        // call method on graphView object to update itself
    }
}