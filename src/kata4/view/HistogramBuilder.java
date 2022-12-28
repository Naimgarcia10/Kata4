package kata4.view;

import java.util.List;
import kata4.model.Histogram;

public class HistogramBuilder {
    private Histogram <String> histogram = new Histogram<String>();
    public void BuildHistogram(List<String> domains){
        for (String domain : domains) 
            histogram.increment(domain);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HistogramDisplay...");
        histogramDisplay.execute();
    }
}
