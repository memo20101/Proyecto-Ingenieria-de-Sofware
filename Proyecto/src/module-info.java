

module Proyecto {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml,javafx.base ;
	opens modelo to javafx.graphics, javafx.fxml,javafx.base;
}
