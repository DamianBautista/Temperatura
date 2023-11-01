
package temperatura;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class g {
    
    public g(){}
    
    public void grafica(JPanel p,ArrayList<ArrayList> d,int op){
        XYLineAndShapeRenderer renderer;
        XYPlot plot;
        XYSeries sSeries = new XYSeries("Temperatura");    
        XYSeries iSeries = new XYSeries("Predicción");
        String mes[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"+
                "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"+
                "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        for(int x=0;x<d.size();x++){
            if((double)d.get(x).get(0)!=-1.0){
                sSeries.add(x+1,(double)d.get(x).get(0));
            }            
            iSeries.add(x+1,(double)d.get(x).get(1));
        }       
        XYSeriesCollection oDataset = new XYSeriesCollection();
        JFreeChart oChart = ChartFactory.createXYLineChart("Temperatura Holt-Winters","Mes","T",oDataset,PlotOrientation.VERTICAL,true,false,false);
        plot = oChart.getXYPlot();
        renderer = new XYLineAndShapeRenderer();
        if(op==1){
            oDataset.addSeries(sSeries);
            renderer.setSeriesPaint(0, Color.BLUE);
            renderer.setSeriesStroke(0, new BasicStroke(0.5f));
        }else if(op==2){
            oDataset.addSeries(iSeries);
            renderer.setSeriesPaint(0, Color.RED);
            renderer.setSeriesStroke(0, new BasicStroke(0.5f));
        }else if(op==3){
            renderer.setSeriesPaint(0, Color.GREEN);
            renderer.setSeriesStroke(0, new BasicStroke(0.5f));
        }else {
        oDataset.addSeries(sSeries);
        oDataset.addSeries(iSeries);
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesPaint(1, Color.RED);
        renderer.setSeriesPaint(2, Color.GREEN);
        renderer.setSeriesStroke(0, new BasicStroke(0.5f));
        renderer.setSeriesStroke(1, new BasicStroke(0.5f));
        renderer.setSeriesStroke(2, new BasicStroke(0.5f));
        }
        plot.setRenderer(renderer);
        ChartPanel oPanel = new ChartPanel(oChart);
        p.setLayout(new java.awt.BorderLayout());
        p.add(oPanel);
        p.validate();
    }
    
}
