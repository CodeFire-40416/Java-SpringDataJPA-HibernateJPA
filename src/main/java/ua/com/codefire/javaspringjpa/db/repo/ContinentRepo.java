/*
 * Copyright (C) 2016 CodeFireUA <edu@codefire.com.ua>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ua.com.codefire.javaspringjpa.db.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import ua.com.codefire.javaspringjpa.db.entity.Continent;

/**
 *
 * @author CodeFireUA <edu@codefire.com.ua>
 */
public interface ContinentRepo extends CrudRepository<Continent, Integer> {
    
    public List<Continent> findByOrderByNameDesc();
    
}
