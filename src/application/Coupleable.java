package application;

/**
 * Coupleable provides template for lambda expressions
 * for creating arbitrary coupling rules without needing
 * to write dedicated functions for each.
 */
@FunctionalInterface
public interface Coupleable {

	int apply(Integer...numbers);

}
