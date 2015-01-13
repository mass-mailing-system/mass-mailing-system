package com.mass.mailing.system.shared;

/**
 * Начальный объект, от которого должны унаследоваться все уникальные сущности.
 * @author Illia Rudenko
 */
public abstract class Entity {

    public abstract Object getId();

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;

        final Entity entity = (Entity) obj;
        return this.getId().equals(entity.getId());
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }

}
