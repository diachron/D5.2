public interface IOProcessor {
	// Initialise the io processor with the necessary in-memory objects and metrics
	void setUpProcess();
	
	// Process the dataset for quality assessment
	void startProcessing() throws ProcessorNotInitialised;
	
	// Cleans up memory from unused objects after processing is finished
	void cleanUp() throws ProcessorNotInitialised;
}
