package com.nt.rowmapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.nt.model.ExamResult;

public class ExamResultMapper implements FieldSetMapper<ExamResult> {

	@Override
	public ExamResult mapFieldSet(FieldSet fieldSet) throws BindException {
	    ExamResult result=null;
	    result=new ExamResult();
	    result.setId(fieldSet.readInt(0));
	    result.setSemester(fieldSet.readInt(1));
	    result.setPercentage(fieldSet.readFloat(2));
	    result.setDob(new java.sql.Date(fieldSet.readDate(3).getTime()));
	    
	    
		return result;
	}

}
