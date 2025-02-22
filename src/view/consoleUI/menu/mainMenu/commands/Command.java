package view.consoleUI.menu.mainMenu.commands;

/**
 * Интерфейс Sortedable представляет команду в меню консольного пользовательского интерфейса (UI).
 * Команда содержит описание и метод выполнения.
 */
public interface Command {
    /**
     * Возвращает описание команды.
     *
     * @return описание команды
     */
    String getDescription();

    /**
     * Выполняет команду.
     */
    void execute();
}
