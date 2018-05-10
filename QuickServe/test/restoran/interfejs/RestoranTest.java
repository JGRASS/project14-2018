package restoran.interfejs;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import artikal.Artikal;

public class RestoranTest {

	Artikal artikal;
	Artikal artikal1;
	Restoran restoran;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		restoran = new Restoran();
		artikal = new Artikal(100, "naziv", "/hrana/Biftek.png", null, "tip");
		artikal1 = new Artikal(200, "naziv", "/hrana/Biftek.png", null, "tip");
	}

	@After
	public void tearDown() throws Exception {
		restoran = null;
		artikal = null;
	}

	@Test
	public void testPoruciArtikalPrimarniScenario() {
		restoran.poruciArtikal(artikal);
		assertEquals(1, restoran.vratiRacun().size());
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testPoruciArtikalNull() {
		restoran.poruciArtikal(null);
	}

	@Test
	public void testRacunaUkupanIznosRacunaPrimarniScenario() {
		restoran.poruciArtikal(artikal);
		restoran.poruciArtikal(artikal1);
		assertEquals(300,restoran.racunaUkupanIznosRacuna(),0);
	}
	
	@Test
	public void testRacunaUkupanIznosRacunaNull() {
		assertEquals(0,restoran.racunaUkupanIznosRacuna(),0);
	}

	@Test
	public void testVratiRacun() {
		restoran.poruciArtikal(artikal);
		LinkedList<Artikal> asd = new LinkedList<>();
		asd.add(artikal);
		assertEquals(asd,restoran.vratiRacun());
	}

}
