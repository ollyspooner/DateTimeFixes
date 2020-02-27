// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package datefixes.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the DateFixes module
	public static java.util.Date sUB_RoundDate(IContext context, java.util.Date _dateTime, java.lang.Long _thresholdHours)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DateTime", _dateTime);
			params.put("ThresholdHours", _thresholdHours);
			return (java.util.Date)Core.execute(context, "DateFixes.SUB_RoundDate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sUB_UTCDateHasTime(IContext context, java.util.Date _dateTime)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DateTime", _dateTime);
			return (java.lang.Boolean)Core.execute(context, "DateFixes.SUB_UTCDateHasTime", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}