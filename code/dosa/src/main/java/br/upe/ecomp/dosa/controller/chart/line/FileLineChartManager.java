/**
 * Copyright (C) 2010
 * Swarm Intelligence Team (SIT)
 * Department of Computer and Systems
 * University of Pernambuco
 * Brazil
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package br.upe.ecomp.dosa.controller.chart.line;

import java.awt.Color;
import java.awt.Panel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import br.upe.ecomp.dosa.controller.chart.IChartManager;

/**
 * Plot a line chart.
 * 
 * @author Rodrigo Castro
 */
public class FileLineChartManager implements IChartManager {

    private FileLineResultsAnalyzer resultsAnalyzer;

    /**
     * Creates a new instance of this class.
     */
    public FileLineChartManager() {
        resultsAnalyzer = new FileLineResultsAnalyzer();
    }

    /**
     * {@inheritDoc}
     */
    public Panel plot(List<File> files, String measurement, int step, boolean logarithmicYAxis) {
        Integer lastIteration = resultsAnalyzer.getLastIteration(files);
        double[] data = resultsAnalyzer.getData(files, measurement, lastIteration, step);
        return createContents(data, logarithmicYAxis, measurement);
    }

    private Panel createContents(double[] values, boolean logarithmicYAxis, String measurement) {
        Panel chartPanel = new Panel();

        chartPanel.setLayout(new java.awt.GridLayout(1, 1));

        JFreeChart chart = createChart("", "Iterations", "Fitness", createSampleDataset(values, measurement), false);

        ChartPanel jFreeChartPanel = new ChartPanel(chart);
        chartPanel.add(jFreeChartPanel);

        return chartPanel;
    }

    private JFreeChart createChart(String title, String xLabel, String yLabel, CategoryDataset dataset,
            boolean logarithmicYAxis) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createLineChart("", // chart title
                xLabel, // domain axis label
                yLabel, // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                false // urls
                );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        // final StandardLegend legend = (StandardLegend) chart.getLegend();
        // legend.setDisplaySeriesShapes(true);
        // legend.setShapeScaleX(1.5);
        // legend.setShapeScaleY(1.5);
        // legend.setDisplaySeriesLines(true);

        chart.setBackgroundPaint(Color.white);

        final CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setRangeGridlinePaint(Color.white);

        // customise the range axis...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setAutoRangeIncludesZero(true);
        return chart;
    }

    private CategoryDataset createSampleDataset(double[] values, String measurement) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }
        Collections.sort(list);
        int i = 1;
        for (Double value : list) {
            dataset.addValue(value, measurement, "" + i++);
        }
        return dataset;
    }
}
