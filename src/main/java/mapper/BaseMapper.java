package mapper;

import org.mapstruct.Mapper;

/**
 * Created by 王汗超 on 2017/5/17.
 */

@Mapper(componentModel = "spring")
public interface BaseMapper<Entity, Dto> {

    Dto toDto(Entity entity);

    Entity toEntity(Dto dto);
}
