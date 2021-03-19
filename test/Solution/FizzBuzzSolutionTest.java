package Solution;

import fizzbuzz.Solution.FizzBuzzSolution;
import fizzbuzz.Solution.NonPositiveNumberException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzSolutionTest {
    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3() throws NonPositiveNumberException {
        int number = 3;

        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String convertedNumber = fizzBuzzSolution.convert(number);

        assertThat(convertedNumber, is("fizz"));
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsMultipleOf5() throws NonPositiveNumberException {
        int number = 5;

        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String convertedNumber = fizzBuzzSolution.convert(number);

        assertThat(convertedNumber, is("buzz"));
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsMultipleOf3And5() throws NonPositiveNumberException {
        int number = 15;

        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String convertedNumber = fizzBuzzSolution.convert(number);

        assertThat(convertedNumber, is("fizzbuzz"));
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIs0() throws NonPositiveNumberException {
        int number = 0;

        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String convertedNumber = fizzBuzzSolution.convert(number);

        assertThat(convertedNumber, is("fizzbuzz"));
    }

    @Test(expected = NonPositiveNumberException.class)
    public void shouldNotReturnNeitherFizzOrBuzzIfNumberIsNegative() throws NonPositiveNumberException {
        int number = -1;

        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        fizzBuzzSolution.convert(number);
    }
}
