package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;

import java.util.List;

public interface ReaderService {
    public List<FruitTransaction> readFromFile(String filePath);
}
