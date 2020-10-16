package it.polito.tdp.spellchecker.model;

public class TestPerformance {

	public static void main(String[] args) {

		Dictionary model= new Dictionary();
		model.loadDictionary("Italian");

		String inputText="in informatica Java";
		inputText = inputText.replaceAll("\n", " ");
		
		System.out.println(inputText);
	}

}
