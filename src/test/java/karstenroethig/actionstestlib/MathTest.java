package karstenroethig.actionstestlib;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MathTest
{
	@Test
	public void sum_returnsCorrectSum() throws Exception
	{
		assertThat(Math.sum(23, 33)).isEqualTo(56);
	}
}
