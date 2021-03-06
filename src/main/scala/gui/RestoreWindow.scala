package gui

import autogenerated_code.Restore
import javax.swing.{SwingWorker, DefaultListModel, JFrame}
import java.awt.event.{WindowEvent, MouseEvent}
import model.{GameDirectory, SaveFile, BackupDirectory}

/**
 * Created by Chris on 7/6/2014.
 */
class RestoreWindow(val _parent: JFrame, val _modal: Boolean,
                    val backupDir: BackupDirectory, val gameDir: GameDirectory) extends Restore(_parent, _modal) {

  override def formWindowOpened(evt: WindowEvent): Unit = {
    updateListContents()
    println("HEEEEELLLLOOOOOO!!!!")
  }

  override def restoreButtonMouseClicked(evt: MouseEvent): Unit = {
    backupList.getSelectedIndex match {
      case index if index > -1 =>
        backupDir.restoreTo(gameDir, saveDataModel.get(index))
        new MessageAnimator("<html><font color=green>Done!</font></html>").execute()
      case _ =>
        new MessageAnimator("Hey! Make sure ya pick one!", 4000).execute()
    }
  }

  override def closeButtonMouseClicked(evt: MouseEvent): Unit = {
    this.setVisible(false)
  }

  private def updateListContents(): Unit = {
    saveDataModel.clear()
    backupDir.getSaveFiles().sortBy(_.timestamp).reverse.foreach(f => saveDataModel.addElement(f))
  }

  class MessageAnimator(val text: String, val delay: Int) extends SwingWorker[Void, Void] {
    def this(text: String) = {
      this(text, 1500)
    }
    override def doInBackground(): Void = {
      statusDisplay.setText(text)
      Thread.sleep(delay)
      statusDisplay.setText("")
      null
    }
  }


}
