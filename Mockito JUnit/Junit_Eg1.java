package com.junit.mockito;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Junit_Eg1 {


	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		// using Mockito.mock() method
		List<String> mockList = mock(List.class);
		when(mockList.size()).thenReturn(5);
		assertTrue(mockList.size()==5);
	}
	
}


