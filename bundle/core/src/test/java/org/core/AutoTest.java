package org.core;


import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import exception.AjtokSzamaNemMegfelelo;
import exception.GyartasiIdoNemMegfelelo;
import exception.RendszamNemMegfelelo;

public class AutoTest {
	
	Auto testAuto;
	
	@Before
	public void initAuto(){
		testAuto = new Auto();
	}
	
	@Test
	public void testAjtokSzamaMegfelelo() throws AjtokSzamaNemMegfelelo {
		testAuto.setAjtokSzama(3);
	}

	@Test(expected = AjtokSzamaNemMegfelelo.class)
	public void testAjtokSzamaTulAlacsony() throws AjtokSzamaNemMegfelelo {
		testAuto.setAjtokSzama(-1);
	}

	@Test(expected = AjtokSzamaNemMegfelelo.class)
	public void testAjtokSzamaTulMagas() throws AjtokSzamaNemMegfelelo {
	    testAuto.setAjtokSzama(6);
	}
	
	@Test
	public void testJoRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABC-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testKotojelNelkulirendszamRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABC123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testTulHosszuBetusRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABCA-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testTulHosszuSzamosRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABC-1234";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testCsakSzamokRendszam() throws RendszamNemMegfelelo {
		String rendszam = "123-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testCsakBetukRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABC-ABC";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testKisBetusRendszam() throws RendszamNemMegfelelo {
		String rendszam = "aaa-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test(expected = RendszamNemMegfelelo.class)
	public void testQbetuvelRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABQ-123";
		testAuto.setRendszam(rendszam);
	}
	
	@Test
	public void testJoGyartasiIdo() throws GyartasiIdoNemMegfelelo{
		String gyartasiIdo = "2021-04-17";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
	
	@Test(expected = GyartasiIdoNemMegfelelo.class)
	public void testKesoiGyartasiIdo() throws GyartasiIdoNemMegfelelo{
		String gyartasiIdo = "2022-04-17";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
	
	@Test(expected = GyartasiIdoNemMegfelelo.class)
	public void testKoraiGyartasiIdo() throws GyartasiIdoNemMegfelelo{
		String gyartasiIdo = "1700-04-17";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}
}
