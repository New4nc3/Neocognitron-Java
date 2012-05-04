package neocognitron;

public class CCell {

	private double[] d;
	private double alpha;

	public CCell(double[] initD, double initAlpha) {
		d = initD;
		alpha = initAlpha;
	}

	public double propigate(double[] input, double v)
	{
		double output = NeocognitronStructure.arrayMultiply(d, input);
		output = (1 + output)/(1 + v) - 1;
		
		output = output/(alpha + output);
		
		if (output < 0)
			output = 0;

		return output;
	}
}