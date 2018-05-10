package restoran.sistemskeoperacije;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import artikal.Artikal;
import restoran.interfejs.Restoran;

public class SORacunaUkupanIznosRacunaTest {

	Artikal artikal;
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
	}

	@After
	public void tearDown() throws Exception {
		restoran = null;
		artikal = null;
	}

	@Test
	public void testRacunaUkupanIznosRacunaPrimarniScenario() {
		restoran.poruciArtikal(artikal);
		assertEquals(100,restoran.racunaUkupanIznosRacuna(),0);
	}
	
	@Test
	public void testRacunaUkupanIznosRacunaNull() {
		assertEquals(0,restoran.racunaUkupanIznosRacuna(),0);
	}

}