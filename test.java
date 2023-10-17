public class Test{
	public WebElement wait(int seconds,By by){
		WebDriverWait webDriverWait=new WebDriverWait(webDriver,Duration.ofSeconds(seconds),Duration.ofMillis(1000))
		return webDriverWait.until(ExceptedConditions.presenceOfElementLocated(by)) 
	}
	public void swipeBottom(By parentBy){
		Rectangle rectangle=getRectangle(parentByd);
		TouchAction action=new TouchAction(androidDriver);
		action.press(
			PointOption.point(
				rectangle.x+rectangle.width/2,
				rectangle.y+rectangle.getHeight()-10
			)
		).moveTo(
			PointOption.point(
				rectangle.x+rectangle.width/2,
				rectangle.y+10
			)
		).release()
		 .perform()
	}
	public void swipeTop(By parentBy){
		Rectangle rectangle=getRectangle(parentBy);
		TouchAction action=new TouchAction(androidDriver);
		action.press(
			PointOption.point(
				rectangle.x+rectangle.width/2,
				rectangle.y+10
			)
		).moveTo(
			PointOption.point(
				rectangle.x+rectangle.width/2,
				rectangle.y+ rectangle.getHeight()-10
			)
		).release()
		 .perform();
	}
}