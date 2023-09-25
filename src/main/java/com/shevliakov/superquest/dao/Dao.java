/* (C)2023 */
package com.shevliakov.superquest.dao;

import java.util.List;

public interface Dao<T> {
    List<T> getAll();

    T getById(int id);
}
