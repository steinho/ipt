package org.gbif.provider.dao.jdbc;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.gbif.provider.dao.DatasourceInspection;
import org.springframework.beans.factory.annotation.Autowired;


public class DatasourceInspectionImplTest extends BaseDaoTestCase{
	@Autowired
	private DatasourceInspection datasourceInspection;
		
	public void testGetAllTables() throws Exception {
		List<String> tables = datasourceInspection.getAllTables();
		System.out.println(tables);
	    assertTrue(1 > 0);
	}
}
