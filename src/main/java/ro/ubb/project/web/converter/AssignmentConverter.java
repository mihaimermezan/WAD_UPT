package ro.ubb.project.web.converter;

import org.springframework.stereotype.Component;
import ro.ubb.project.web.dto.AssignmentDto;
import ro.ubb.project.core.model.Assignment;

@Component
public class AssignmentConverter extends AbstractConverter<Assignment, AssignmentDto> implements Converter<Assignment, AssignmentDto> {

    @Override
    public Assignment dtoToModel(AssignmentDto assignmentDto) {
        return Assignment.builder()
                .pcid(assignmentDto.getPcid())
                .pid(assignmentDto.getPid())
                .qualifier(assignmentDto.getQualifier())
                .build();
    }

    @Override
    public AssignmentDto modelToDto(Assignment assignment) {
        return AssignmentDto.builder()
                .pcid(assignment.getPcid())
                .pid(assignment.getPid())
                .qualifier(assignment.getQualifier())
                .build();
    }
}
