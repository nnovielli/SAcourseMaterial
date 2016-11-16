package analysis.sentistrength;

import uk.ac.wlv.sentistrength.SentiStrength;

public class SentiStrengthSentiment {

	public SentiStrengthSentiment() {
		super();
	}
	
	public String SentiStrengthgetScore(String text){
		SentiStrength sentiStrength = new SentiStrength();
            	String ssthInitialisation[] = {"sentidata", "src/analysis/sentistrength/lib/SentiStrength_Data/", "explain"};
		sentiStrength.initialise(ssthInitialisation);
		String score = sentiStrength.computeSentimentScores(text);
		String[] split_res = score.split(" ");
		String pos_score = split_res[0];
		String neg_score = split_res[1];
				
		return pos_score + "," + neg_score;
		//return score;
	}

}