package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.es");
        histogram.increment("dis.es");
        histogram.increment("dis.es");
        histogram.increment("dis.es");
        histogram.increment("miCorreo.es");
        histogram.increment("miCorreo.es");
        histogram.increment("miCorreo.es");
        histogram.increment("noUsar.es");
        
        new HistogramDisplay(histogram).execute();
    }
    
}