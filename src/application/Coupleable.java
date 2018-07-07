package application;

/**
 * This interface provides template for lambda expressions
 * for creating arbitrary coupling rules without having
 * to write dedicated functions for each different rule.
 */
@FunctionalInterface
public interface Coupleable {

	int apply(Integer...numbers);
}
