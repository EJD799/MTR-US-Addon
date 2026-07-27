package org.mtrus.screen;

import org.mtr.core.tool.Utilities;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.*;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.data.IGui;
import org.mtrus.MTRUSAddonClient;

public class ResourcePackWarningScreen extends ScreenExtension implements IGui, Utilities {

	private ButtonWidgetExtension buttonDownload;
	private ButtonWidgetExtension buttonClose;

	private static final int BUTTON_WIDTH = SQUARE_SIZE * 8;

	public ResourcePackWarningScreen() {
		super();

		buttonDownload = new ButtonWidgetExtension(
			0, 0,
			BUTTON_WIDTH,
			SQUARE_SIZE,
			TextHelper.literal("Download US PIDS Pack"),
			button -> Util.getOperatingSystem().open(MTRUSAddonClient.REQUIRED_PACK_LINK)
		);

		buttonClose = new ButtonWidgetExtension(
			0, 0,
			BUTTON_WIDTH,
			SQUARE_SIZE,
			TextHelper.literal("Continue without US PIDS Pack"),
			button -> MinecraftClient.getInstance().openScreen(null)
		);
	}

	@Override
	protected void init2() {
		super.init2();

		IDrawing.setPositionAndWidth(
			buttonDownload,
			width / 2 + SQUARE_SIZE / 2,
			height - SQUARE_SIZE * 2,
			BUTTON_WIDTH
		);

		IDrawing.setPositionAndWidth(
			buttonClose,
			width / 2 - BUTTON_WIDTH - SQUARE_SIZE / 2,
			height - SQUARE_SIZE * 2,
			BUTTON_WIDTH
		);

		addChild(new ClickableWidget(buttonDownload));
		addChild(new ClickableWidget(buttonClose));
	}

	@Override
	public void render(GraphicsHolder graphicsHolder, int mouseX, int mouseY, float delta) {
		renderBackground(graphicsHolder);
		super.render(graphicsHolder, mouseX, mouseY, delta);

		graphicsHolder.push();
		graphicsHolder.translate(width / 2F, SQUARE_SIZE, 0);
		graphicsHolder.scale(2, 2, 1);
		graphicsHolder.drawCenteredText("MTR US Addon", 0, 0, System.currentTimeMillis() % 1000 < 500 ? 0xFF5555 : 0x5555FF);
		graphicsHolder.pop();

		int i = SQUARE_SIZE * 2;
		graphicsHolder.drawCenteredText("The US PIDS Pack is required for the MTR US Addon PIDS blocks.", width / 2, i += TEXT_HEIGHT, ARGB_WHITE);
		graphicsHolder.drawCenteredText("Please install or update it now.", width / 2, i += TEXT_HEIGHT, ARGB_WHITE);
		graphicsHolder.drawCenteredText("The minimum required version of the US PIDS Pack for this mod version is " + MTRUSAddonClient.REQUIRED_PACK_VERSION_STRING + ".", width / 2, i += TEXT_HEIGHT, ARGB_WHITE);
	}

	@Override
	public boolean isPauseScreen2() {
		return false;
	}

	private static boolean shown = false;

	public static void handle() {
		if (shown) {
			return;
		}

		if (!MTRUSAddonClient.resourcePackChecked) {
			return;
		}

		if (MTRUSAddonClient.resourcePackValid) {
			return;
		}

		MinecraftClient client = MinecraftClient.getInstance();
		Screen screen = client.getCurrentScreenMapped();

		if (screen != null && screen.getTitle().data.toString().contains("narrator.screen.title")) {
			shown = true;
			client.openScreen(new Screen(new ResourcePackWarningScreen()));
		}
	}
}