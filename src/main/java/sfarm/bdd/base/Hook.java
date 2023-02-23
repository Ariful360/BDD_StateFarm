package sfarm.bdd.base;


import static sfarm.bdd.utils.IConstant.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import sfarm.bdd.utils.ReadProperties;

public class Hook {
	BaseClass baseClass;
	ReadProperties envVar = new ReadProperties();

	@Before
	public void initBaseClass() {
		baseClass = new BaseClass();
		baseClass.setUpDriver(envVar.getProperties(BROWSER));

	}

	@After
	public void exitingDriver() {
		baseClass.tearUp();

	}

}
