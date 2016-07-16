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
package ua.com.codefire.javaspringjpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.codefire.javaspringjpa.db.entity.Continent;
import ua.com.codefire.javaspringjpa.db.repo.ContinentRepo;

/**
 *
 * @author CodeFireUA <edu@codefire.com.ua>
 */
public class Main {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        
        ContinentRepo repo = context.getBean(ContinentRepo.class);
        
        Iterable<Continent> findAll = repo.findAll();
        for (Continent continent : findAll) {
            System.out.println(continent.getName());
        }
        
        System.out.println("DESC");
        for (Continent continent : repo.findByOrderByNameDesc()) {
            System.out.println(continent.getName());
        }
    }
}
