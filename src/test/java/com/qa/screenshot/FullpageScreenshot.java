package com.qa.screenshot;

import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FullpageScreenshot {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/");
		Thread.sleep(5000);
		File desc=new File("C:\\Users\\Rami Reddy\\Desktop\\Manual Testing\\realtime documents\\realtime documents\\Manual Testing Notes on daily basis Latest\\FullPageScreenshot.png");
		
		AShot as=new AShot();
		ShootingStrategy shs=ShootingStrategies.viewportPasting(2000);
		Screenshot s=as.shootingStrategy(shs).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", desc);
		
		
		
	}

}
