package com.junit.mockito;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;





public class Sample {
	@SuppressWarnings("unchecked")
	@Test
	public void test() {
	//fail("Not yet implemented");

	//using Mockito.mock() method
	List<String> mockList = mock(List.class);
	when(mockList.size()).thenReturn(5);
	assertTrue(mockList.size()==5);

	
	}

}
