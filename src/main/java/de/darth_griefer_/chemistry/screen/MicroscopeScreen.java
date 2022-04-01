package de.darth_griefer_.chemistry.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import de.darth_griefer_.chemistry.Chemistry;
import de.darth_griefer_.chemistry.container.LightningChannelerContainer;
import de.darth_griefer_.chemistry.container.MicroscopeContainer;
import net.minecraft.client.gui.screen.inventory.AbstractRepairScreen;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.SmithingTableContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import static net.minecraftforge.client.settings.KeyConflictContext.GUI;
public class MicroscopeScreen extends ContainerScreen<MicroscopeContainer> {
    private static final ResourceLocation GUI = new ResourceLocation(Chemistry.MOD_ID,
            "textures/gui/microscope_gui.png");

    public MicroscopeScreen(MicroscopeContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderHoveredTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int x, int y) {
        RenderSystem.color4f(1f, 1f, 1f, 1f);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int i = this.guiLeft;
        int j = this.guiTop;
        this.blit(matrixStack, i, j, 0, 0, this.xSize, this.ySize);

    }
}


