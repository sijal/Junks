package Registerar;

import java.beans.PropertyEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.cpe.bean.GeoLocation;
import com.cpe.editor.GeoLocationPropertyEditor;

public class GlobalPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(GeoLocation.class, (PropertyEditor) new GeoLocationPropertyEditor());
	}
	
}
