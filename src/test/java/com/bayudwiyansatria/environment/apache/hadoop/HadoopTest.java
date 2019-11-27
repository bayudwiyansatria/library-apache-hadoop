package com.bayudwiyansatria.environment.apache.hadoop;

import org.junit.Test;

import static org.junit.Assert.*;

public class HadoopTest {
	@Test
	public void Hadoop(){
		double[][] data = new com.bayudwiyansatria.io.IO().readCSV_double ( "src/main/resources/ruspini" );
		new com.bayudwiyansatria.mat.Mat ().print ( data );
	}
}