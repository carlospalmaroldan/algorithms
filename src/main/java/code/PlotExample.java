package code;
import java.awt.Color;
import java.awt.BasicStroke;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class PlotExample extends ApplicationFrame {

    public PlotExample( String applicationTitle, String chartTitle ) {
        super(applicationTitle);
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
            chartTitle ,
            "Category" ,
            "Score" ,
            createDataset() ,
            PlotOrientation.VERTICAL ,
            true , true , false);

        ChartPanel chartPanel = new ChartPanel( xylineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
        final XYPlot plot = xylineChart.getXYPlot( );

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
        renderer.setSeriesPaint( 0 , Color.RED );
        renderer.setSeriesPaint( 1 , Color.GREEN );
        renderer.setSeriesPaint( 2 , Color.YELLOW );
        renderer.setSeriesStroke( 0 , new BasicStroke( 4.0f ) );
        renderer.setSeriesStroke( 1 , new BasicStroke( 3.0f ) );
        renderer.setSeriesStroke( 2 , new BasicStroke( 2.0f ) );
        plot.setRenderer( renderer );
        setContentPane( chartPanel );
    }

    private XYDataset createDataset( ) {

        final XYSeries expectedPlot = new XYSeries( "Expected (1/2)NlgN" );
        final XYSeries experimentalPlot = new XYSeries("Actual");

        int[] connections = new int[98];
        double[] expected = new double[98];
        for(int i = 2; i<100;i++) {
            connections[i-2] = Sedgewick1517.count(new WeightedQuickUnion(i));
            expected[i-2]=Math.log(i)*i*0.5;
        }
        for(int i = 0; i<expected.length; i++){
            System.out.println(expected[i]+" "+connections[i]);
            experimentalPlot.add( i , connections[i] );
            expectedPlot.add(i,expected[i]);
        }



        final XYSeriesCollection dataset = new XYSeriesCollection( );
        dataset.addSeries( expectedPlot );
        dataset.addSeries(experimentalPlot);

        return dataset;
    }

    public static void main( String[ ] args ) {
        PlotExample chart = new PlotExample("Number of pairs necessary to get one component",
            "expected value vs actual value of pairs generated");
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
    }
}
