package org.core;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import exception.RendszamNemMegfelelo;

@RunWith(Parameterized.class)
public class AutoRendszamTest {
	
	@Parameters
	public static Collection<String> Data()
	{
		List<String> data = new ArrayList<String>();
		data.add("AAAA-123");
		data.add("AAA123");
		data.add("aaa123");
		data.add("AAAA-1234");
		data.add("AAQ-123");
		data.add("AAA-AAA");
		data.add("123-123");
		
		return data;
	}
	
	public AutoRendszamTest(String rendszam){
		this.rendszam = rendszam;
	}
	
	String rendszam;
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void test() throws RendszamNemMegfelelo{
		Auto auto = new Auto();
		System.out.println("A vizsgált remdszám: " + rendszam);
		auto.setRendszam(rendszam);
	}
	
	
}
